package com.example;

import com.example.domain.ImmutableItem;
import com.example.domain.Item;
import com.example.dto.ImmutableItemDTO;
import com.example.dto.ItemDTO;
import org.mapstruct.Mapper;

@Mapper(imports = {ImmutableItem.class, ImmutableItemDTO.class})
public abstract class ItemMapper {
    public abstract Item a(ItemDTO itemDTO);
    public abstract ItemDTO a(Item item);
}
