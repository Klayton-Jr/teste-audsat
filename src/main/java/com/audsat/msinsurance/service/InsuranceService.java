package com.audsat.msinsurance.service;

import com.audsat.msinsurance.dto.BudgetDTO;
import com.audsat.msinsurance.dto.request.NewBudgetRequest;

public interface InsuranceService {

    BudgetDTO returnInsurance(Long id);
    BudgetDTO createInsurance(NewBudgetRequest budegetRequest);
    void updateInsurance();
    void deleteInsurance();
}
