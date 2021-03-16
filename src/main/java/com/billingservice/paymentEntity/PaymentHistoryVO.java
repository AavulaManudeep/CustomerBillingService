package com.billingservice.paymentEntity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name="payment_history", catalog = "cabletv_billing")
public class PaymentHistoryVO implements Serializable {

    @Id
    @Column(name="customerid")
    private String customerId;

    @Column(name="paymenttype")
    private String paymentType;

    @Column(name="paymentdate")
    private Date paymentDate;

    


}
