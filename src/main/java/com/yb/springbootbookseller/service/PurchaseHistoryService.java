package com.yb.springbootbookseller.service;

import com.yb.springbootbookseller.model.PurchaseHistory;
import com.yb.springbootbookseller.repository.IPurchaseHistoryRepository;
import com.yb.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService {

    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemForUser(Long userId){
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
