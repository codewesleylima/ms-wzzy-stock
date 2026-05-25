package com.wzzy.library.msstock.exception;

import com.wzzy.library.bfflibrary.exception.ValidationException;

public class InsufficientStockException extends ValidationException {
    public InsufficientStockException(String bookTitle, int requested, int available) {
        super("Insufficient stock for book '" + bookTitle + "'. Requested: " + requested + ", Available: " + available,
              "INSUFFICIENT_STOCK");
    }
}
