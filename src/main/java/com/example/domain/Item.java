package com.example.domain;

import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
public abstract class Item {
    public abstract UUID getId();
    public abstract UUID getItemType();
}