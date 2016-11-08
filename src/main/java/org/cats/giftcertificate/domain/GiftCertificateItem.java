package org.cats.giftcertificate.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cats.commodity.domain.Commodity;
import org.cats.commodity.domain.UnitOfMeasure;
import org.cats.common.Currency;
import org.cats.core.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class GiftCertificateItem extends BaseModel {
    private BigDecimal amount;
    private BigDecimal estimatedValue;
    private BigDecimal estimatedTax;
    private Date expirationDate;

    @ManyToOne
    @JsonIgnore
    private GiftCertificate giftCertificate;

    @ManyToOne
    private Commodity commodity;

    @ManyToOne
    private FundSource fundSource;

    @ManyToOne
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Currency currency;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(BigDecimal estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public BigDecimal getEstimatedTax() {
        return estimatedTax;
    }

    public void setEstimatedTax(BigDecimal estimatedTax) {
        this.estimatedTax = estimatedTax;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public FundSource getFundSource() {
        return fundSource;
    }

    public void setFundSource(FundSource fundSource) {
        this.fundSource = fundSource;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public GiftCertificate getGiftCertificate() {
        return giftCertificate;
    }

    public void setGiftCertificate(GiftCertificate giftCertificate) {
        this.giftCertificate = giftCertificate;
    }
}
