package com.netoptc.DsCommerce.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() { super("Recuso não entrado"); }
}
