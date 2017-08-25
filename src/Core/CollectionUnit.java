/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import java.util.HashMap;

/**
 * A collection unit and all the support bits (work queue, etc).
 * @author rserrano
 */
public class CollectionUnit extends WWBaseObject{
    private int office;     // The office number for this collector
    private int collector;  // The collector number
    private User[] user;    // User(s) attached to this collection unit.
    private String dunningName; 
    private int specialties;
    private int collectorType; //bitmask
    private WorkQueue collectorQueue;   
    private int team;
    private int monthlyGoal;
    private int maxQueueSize;
    private int maxNewBusiness;
    private PriorityCalculator priorityCalculator;
    private int maxIdleDays;
    private int waitDays;
    private HashMap<String,CollectorStats> collStats;
    private HashMap<String,CollectorStats> collStats2;
    
    //Accessors

    /**
     *
     * @return
     */

    public int getOffice() {
        return office;
    }

    /**
     *
     * @param office
     */
    public void setOffice(int office) {
        this.office = office;
    }

    /**
     *
     * @return
     */
    public int getCollector() {
        return collector;
    }

    /**
     *
     * @param collector
     */
    public void setCollector(int collector) {
        this.collector = collector;
    }

    /**
     *
     * @return
     */
    public User[] getUser() {
        return user;
    }

    /**
     *
     * @param user
     */
    public void setUser(User user[]) {
        this.user = user;
    }

    /**
     *
     * @return
     */
    public String getDunningName() {
        return dunningName;
    }

    /**
     *
     * @param dunningName
     */
    public void setDunningName(String dunningName) {
        this.dunningName = dunningName;
    }

    /**
     *
     * @return
     */
    public int getSpecialties() {
        return specialties;
    }

    /**
     *
     * @param specialties
     */
    public void setSpecialties(int specialties) {
        this.specialties = specialties;
    }

    /**
     *
     * @return
     */
    public int getCollectorType() {
        return collectorType;
    }

    /**
     *
     * @param collectorType
     */
    public void setCollectorType(int collectorType) {
        this.collectorType = collectorType;
    }

    /**
     *
     * @return
     */
    public WorkQueue getCollectorQueue() {
        return collectorQueue;
    }

    /**
     *
     * @param collectorQueue
     */
    public void setCollectorQueue(WorkQueue collectorQueue) {
        this.collectorQueue = collectorQueue;
    }

    /**
     *
     * @return
     */
    public int getTeam() {
        return team;
    }

    /**
     *
     * @param team
     */
    public void setTeam(int team) {
        this.team = team;
    }

    /**
     *
     * @return
     */
    public int getMonthlyGoal() {
        return monthlyGoal;
    }

    /**
     *
     * @param monthlyGoal
     */
    public void setMonthlyGoal(int monthlyGoal) {
        this.monthlyGoal = monthlyGoal;
    }

    /**
     *
     * @return
     */
    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    /**
     *
     * @param maxQueueSize
     */
    public void setMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    /**
     *
     * @return
     */
    public int getMaxNewBusiness() {
        return maxNewBusiness;
    }

    /**
     *
     * @param maxNewBusiness
     */
    public void setMaxNewBusiness(int maxNewBusiness) {
        this.maxNewBusiness = maxNewBusiness;
    }

    /**
     *
     * @return
     */
    public PriorityCalculator getPriorityCalculator() {
        return priorityCalculator;
    }

    /**
     *
     * @param priorityCalculator
     */
    public void setPriorityCalculator(PriorityCalculator priorityCalculator) {
        this.priorityCalculator = priorityCalculator;
    }

    /**
     *
     * @return
     */
    public int getMaxIdleDays() {
        return maxIdleDays;
    }

    /**
     *
     * @param maxIdleDays
     */
    public void setMaxIdleDays(int maxIdleDays) {
        this.maxIdleDays = maxIdleDays;
    }

    /**
     *
     * @return
     */
    public int getWaitDays() {
        return waitDays;
    }

    /**
     *
     * @param waitDays
     */
    public void setWaitDays(int waitDays) {
        this.waitDays = waitDays;
    }

    /**
     * @return the collStats
     */
    public HashMap<String,CollectorStats> getCollStats() {
        return collStats;
    }

    /**
     * @return the collStats2
     */
    public HashMap<String,CollectorStats> getCollStats2() {
        return collStats2;
    }

    /**
     * @param collStats the collStats to set
     */
    protected void setCollStats(HashMap<String,CollectorStats> collStats) {
        this.collStats = collStats;
    }

    /**
     * @param collStats2 the collStats2 to set
     */
    protected void setCollStats2(HashMap<String,CollectorStats> collStats2) {
        this.collStats2 = collStats2;
    }
    
    
}
