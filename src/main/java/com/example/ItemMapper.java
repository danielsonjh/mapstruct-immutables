package com.example;

import com.example.domain.Item;
import com.example.dto.ItemDTO;
import org.mapstruct.Mapper;

@Mapper
public abstract class ItemMapper {
    public abstract Item a(ItemDTO itemDTO);
    public abstract ItemDTO a(Item item);
}
