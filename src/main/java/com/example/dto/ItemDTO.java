package com.example.dto;

import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
public abstract class ItemDTO {
    public abstract UUID getId();
    public abstract UUID getItemType();
}