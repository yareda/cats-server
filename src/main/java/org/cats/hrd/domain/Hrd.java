package org.cats.hrd.domain;

import org.cats.core.BaseModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Hrd extends BaseModel {
    @NotNull
    private String year;

    @ManyToOne
    private Season season;

    @ManyToOne
    private Ration ration;

    private Integer status;
    private Integer montFrom;
    private Integer monthTo;
    private Integer duration;
    private Date createdDate;
    private Date publishedDate;
    private Boolean archived;

    @OneToMany(mappedBy = "hrd")
    private List<HrdPlanItem> hrdPlanItemList = new ArrayList<HrdPlanItem>();


    Hrd(){}

    public Hrd(String year, Integer monthFrom, Integer monthTo, Integer duration, Season season, Ration ration){
        this.year = year;
        this.montFrom = monthFrom;
        this.monthTo = monthTo;
        this.duration = duration;
        this.season = season;
        this.ration = ration;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Ration getRation() {
        return ration;
    }

    public void setRation(Ration ration) {
        this.ration = ration;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMontFrom() {
        return montFrom;
    }

    public void setMontFrom(Integer montFrom) {
        this.montFrom = montFrom;
    }

    public Integer getMonthTo() {
        return monthTo;
    }

    public void setMonthTo(Integer monthTo) {
        this.monthTo = monthTo;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public List<HrdPlanItem> getHrdPlanItemList() {
        return hrdPlanItemList;
    }

    public void setHrdPlanItemList(List<HrdPlanItem> hrdPlanItemList) {
        this.hrdPlanItemList = hrdPlanItemList;
    }
}
