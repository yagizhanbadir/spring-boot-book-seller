package com.yb.springbootbookseller.controller;

import com.yb.springbootbookseller.model.PurchaseHistory;
import com.yb.springbootbookseller.security.UserPrincipal;
import com.yb.springbootbookseller.service.IPurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")//pre-path
public class PurchaseHistoryController
{
    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @PostMapping("save") //api/purchase-history
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory)
    {
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);
    }

    @GetMapping //api/purchase-history
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemForUser(userPrincipal.getId()));
    }
}