package com.wipro.order_service.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.wipro.order_service.common.AppConstant;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

  private Key key() {
    return Keys.hmacShaKeyFor(AppConstant.SECRET.getBytes(StandardCharsets.UTF_8));
  }

  @Override
  protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
      throws ServletException, IOException {

    String header = req.getHeader(HttpHeaders.AUTHORIZATION);
    if (header != null && header.startsWith(AppConstant.PREFIX)) {
      String token = header.substring(AppConstant.PREFIX.length());

      try {
        var claims = Jwts.parserBuilder().setSigningKey(key()).build()
            .parseClaimsJws(token).getBody();

        String username = claims.getSubject(); // we just set subject as principal

        var auth = new UsernamePasswordAuthenticationToken(
            username, null, List.of() // map roles from claims if you add them later
        );
        auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));
        SecurityContextHolder.getContext().setAuthentication(auth);
      } catch (Exception ignored) {
        // invalid/expired -> leave context empty; Security will return 401
      }
    }
    chain.doFilter(req, res);
  }
}
