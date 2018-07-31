package com.imooc.campus.dao;

import com.imooc.campus.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopDao extends JpaRepository {

    Shop insertShop(Shop shop);
}
