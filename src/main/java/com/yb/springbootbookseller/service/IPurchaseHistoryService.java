package com.yb.springbootbookseller.service;

import com.yb.springbootbookseller.model.PurchaseHistory;
import com.yb.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemForUser(Long userId);
}
