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

import java.sql.Time;
import java.util.Date;

/**
 * A history record.
 * @author odin
 */


public class History extends WWBaseObject {
    private Long histID;
    private WWBaseObject reference;
    private Debtor debtor;
    private Debt debt;
    private Date contactDate;
    private Time contactTime;
    private String contactType;
    private String contactCode;
    private CollectionUnit collectionUnit;
    private User user;
    private Date promiseDate;
    private Long promiseAmount;
    private boolean containsPHI;    //Applies to comments, primarily,
    private String comments;
    
    //Accessors
    // Development note: Setters should not really be public, IMHO.
    
    /**
     * Get the debtor this item is attached.
     * @return
     */
    public Debtor getDebtor() {
        return debtor;
    }

    /**
     * Attach this item to another debtor.
     * @param debtor
     */
    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    /**
     * Get the debt this item is attached to.
     * @return
     */
    public Debt getDebt() {
        return debt;
    }

    /**
     * Attach this item to a debt.
     * @param debt
     */
    public void setDebt(Debt debt) {
        this.debt = debt;
    }

    /**
     * Get the contact date for this entry.
     * @return
     */
    public Date getContactDate() {
        return contactDate;
    }

    /**
     * Set the contact date for this entry (Restricted)
     * @param contactDate
     */
    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    /**
     * Get the time of contact.
     * @return
     */
    public Time getContactTime() {
        return contactTime;
    }

    /**
     * Set the Contact time.
     * @param contactTime
     */
    public void setContactTime(Time contactTime) {
        this.contactTime = contactTime;
    }

    /**
     * Get the contact code.
     * @return
     */
    public String getContactCode() {
        return contactCode;
    }

    /**
     * Set the contact code.
     * @param contactCode
     */
    public void setContactCode(String contactCode) {
        this.contactCode = contactCode;
    }

    /**
     * Get the collection unit.
     * @return
     */
    public CollectionUnit getCollectionUnit() {
        return collectionUnit;
    }

    /**
     * Attach this item to a collection unit.
     * @param collectionUnit
     */
    public void setCollectionUnit(CollectionUnit collectionUnit) {
        this.collectionUnit = collectionUnit;
    }

    /**
     * Get the user for this item.
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user for this item.
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get the promise date (if any) for this item.
     * @return
     */
    public Date getPromiseDate() {
        return promiseDate;
    }

    /**
     * Set a promise date for this item.
     * @param promiseDate
     */
    public void setPromiseDate(Date promiseDate) {
        this.promiseDate = promiseDate;
    }

    /**
     * Get the promise amount  for this item.
     * @return
     */
    public Long getPromiseAmount() {
        return promiseAmount;
    }

    /**
     * Set the promise amount for this item.
     * @param promiseAmount
     */
    public void setPromiseAmount(Long promiseAmount) {
        this.promiseAmount = promiseAmount;
    }

    /**
     * Get the comments for this item.
     * @return
     */
    public String getComments() {
        return comments;
    }

    /**
     * Set the comments for this item.
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * What is the type of contact (Phone call, promise, reminder, etc).
     * @return
     */
    public String getContactType() {
        return contactType;
    }

    /**
     *
     * @param contactType
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     *
     * @return
     */
    public boolean getContainsPHI() {
        return containsPHI;
    }

    /**
     *
     * @param containsPHI
     */
    public void setContainsPHI(boolean containsPHI) {
        this.containsPHI = containsPHI;
    }

    /**
     * @return the reference
     */
    protected WWBaseObject getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    protected void setReference(WWBaseObject reference) {
        this.reference = reference;
    }

    /**
     * @return the histID
     */
    public Long getHistID() {
        return histID;
    }
    
}
