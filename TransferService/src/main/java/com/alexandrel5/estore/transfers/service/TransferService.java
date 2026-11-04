package com.alexandrel5.estore.transfers.service;

import com.alexandrel5.estore.transfers.model.TransferRestModel;

public interface TransferService {
    public boolean transfer(TransferRestModel productPaymentRestModel);
}
