package com.alpha.cart.repository;

import com.alpha.cart.model.Item;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CassandraRepository<Item, String> {
}
