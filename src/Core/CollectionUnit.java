/* 
 * Copyright (C) 2017 Robert Serrano <wolfieca.rs@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package Core;

import java.util.HashMap;

/**
 * A collection unit and all the support bits (work queue, etc).
 * @author Robert Serrano <wolfieca.rs@gmail.com>
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
    // The collector stats are indexed by month and year
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
