package com.wipro.order_service.common;

public class AppConstant {
  // SAME 64+ char secret as USERMGMTV2-MS (copy/paste exactly)
  public static final String SECRET =
      "u6g0zF6k0y1hN1H9Wk0yBf0F5jG9pP5sYQwqXbKf3S2q9mQZk0i9bO1pQ4s8T2aL";
  public static final String HEADER = "Authorization";
  public static final String PREFIX = "Bearer ";
  public static final long   EXP_MS = 15 * 60 * 1000; // 15 min (not used here, but kept for parity)
}
