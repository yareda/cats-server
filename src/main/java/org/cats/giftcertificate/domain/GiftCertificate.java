package org.cats.giftcertificate.domain;

import org.cats.core.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class GiftCertificate extends BaseModel {
    private Date giftDate;
    private String referenceNo;
    private String vessel;
    private Date eta;
    private String portName;
    private String status;
    private String customsDeclarationNo;
    private String billOfLadding;
    private BigDecimal amount;
    private BigDecimal estimatedPrice;
    private BigDecimal estimatedTax;
    private String purchaseYear;
    private Date expiryDate;
    private String accountNo;

    @ManyToOne
    private Donor donor;

    @ManyToOne
    private Program program;

    @ManyToOne
    private ModeOfTransport modeOfTransport;

    @ManyToOne
    private BudgetType budgetType;

    @OneToMany(mappedBy = "giftCertificate")
    private List<GiftCertificateItem> giftCertificateItems = new ArrayList<>();

    GiftCertificate(){};

    public Date getGiftDate() {
        return giftDate;
    }

    public void setGiftDate(Date giftDate) {
        this.giftDate = giftDate;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomsDeclarationNo() {
        return customsDeclarationNo;
    }

    public void setCustomsDeclarationNo(String customsDeclarationNo) {
        this.customsDeclarationNo = customsDeclarationNo;
    }

    public String getBillOfLadding() {
        return billOfLadding;
    }

    public void setBillOfLadding(String billOfLadding) {
        this.billOfLadding = billOfLadding;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public BigDecimal getEstimatedTax() {
        return estimatedTax;
    }

    public void setEstimatedTax(BigDecimal estimatedTax) {
        this.estimatedTax = estimatedTax;
    }

    public String getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(String purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public ModeOfTransport getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(ModeOfTransport modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }

    public List<GiftCertificateItem> getGiftCertificateItems() {
        return giftCertificateItems;
    }

    public void setGiftCertificateItems(List<GiftCertificateItem> giftCertificateItems) {
        this.giftCertificateItems = giftCertificateItems;
    }
}
