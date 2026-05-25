package com.wzzy.library.msstock.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class ReservationFailedException extends BaseServiceException {
    public ReservationFailedException(String message) {
        super(message, "RESERVATION_FAILED", 400);
    }

    public ReservationFailedException(String reason, String message) {
        super(message, reason, 400);
    }
}
