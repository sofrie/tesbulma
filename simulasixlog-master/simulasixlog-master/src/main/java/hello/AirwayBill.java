/**
 *
 */
package hello;

import java.math.BigDecimal;

/**
 * @author reza.lesmana
 *
 */
public class AirwayBill {

    private String awbNumber;
    private String reconStatus;
    private BigDecimal priceLogistic;
    private BigDecimal weightLogistic;
    private BigDecimal insuranceChargeLogistic;
    private BigDecimal giftWrapChargeLogistic;
    private BigDecimal otherChargeLogistic;
    private BigDecimal totalChargeLogistic;

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public String getReconStatus() {
        return reconStatus;
    }

    public void setReconStatus(String reconStatus) {
        this.reconStatus = reconStatus;
    }

    public BigDecimal getPriceLogistic() {
        return priceLogistic;
    }

    public void setPriceLogistic(BigDecimal priceLogistic) {
        this.priceLogistic = priceLogistic;
    }

    public BigDecimal getWeightLogistic() {
        return weightLogistic;
    }

    public void setWeightLogistic(BigDecimal weightLogistic) {
        this.weightLogistic = weightLogistic;
    }

    public BigDecimal getInsuranceChargeLogistic() {
        return insuranceChargeLogistic;
    }

    public void setInsuranceChargeLogistic(BigDecimal insuranceChargeLogistic) {
        this.insuranceChargeLogistic = insuranceChargeLogistic;
    }

    public BigDecimal getGiftWrapChargeLogistic() {
        return giftWrapChargeLogistic;
    }

    public void setGiftWrapChargeLogistic(BigDecimal giftWrapChargeLogistic) {
        this.giftWrapChargeLogistic = giftWrapChargeLogistic;
    }

    public BigDecimal getOtherChargeLogistic() {
        return otherChargeLogistic;
    }

    public void setOtherChargeLogistic(BigDecimal otherChargeLogistic) {
        this.otherChargeLogistic = otherChargeLogistic;
    }

    public BigDecimal getTotalChargeLogistic() {
        return totalChargeLogistic;
    }

    public void setTotalChargeLogistic(BigDecimal totalChargeLogistic) {
        this.totalChargeLogistic = totalChargeLogistic;
    }

    @Override
    public String toString() {
        return "AirwayBill [awbNumber=" + awbNumber + ", priceLogistic=" + priceLogistic + ", weightLogistic=" + weightLogistic
                + ", insuranceChargeLogistic=" + insuranceChargeLogistic + ", giftWrapChargeLogistic=" + giftWrapChargeLogistic + ", otherChargeLogistic="
                + otherChargeLogistic + ", totalChargeLogistic=" + totalChargeLogistic + ", reconStatus=" + reconStatus + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((awbNumber == null) ? 0 : awbNumber.hashCode());
        result = prime * result + ((reconStatus == null) ? 0 : reconStatus.hashCode());
        result = prime * result + ((giftWrapChargeLogistic == null) ? 0 : giftWrapChargeLogistic.hashCode());
        result = prime * result + ((insuranceChargeLogistic == null) ? 0 : insuranceChargeLogistic.hashCode());
        result = prime * result + ((otherChargeLogistic == null) ? 0 : otherChargeLogistic.hashCode());
        result = prime * result + ((priceLogistic == null) ? 0 : priceLogistic.hashCode());
        result = prime * result + ((totalChargeLogistic == null) ? 0 : totalChargeLogistic.hashCode());
        result = prime * result + ((weightLogistic == null) ? 0 : weightLogistic.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AirwayBill other = (AirwayBill) obj;
        if (awbNumber == null) {
            if (other.awbNumber != null) {
                return false;
            }
        } else if (!awbNumber.equals(other.awbNumber)) {
            return false;
        }
        if (reconStatus == null) {
            if (other.reconStatus != null) {
                return false;
            }
        } else if (!reconStatus.equals(other.reconStatus)) {
            return false;
        }
        if (giftWrapChargeLogistic == null) {
            if (other.giftWrapChargeLogistic != null) {
                return false;
            }
        } else if (!giftWrapChargeLogistic.equals(other.giftWrapChargeLogistic)) {
            return false;
        }
        if (insuranceChargeLogistic == null) {
            if (other.insuranceChargeLogistic != null) {
                return false;
            }
        } else if (!insuranceChargeLogistic.equals(other.insuranceChargeLogistic)) {
            return false;
        }
        if (otherChargeLogistic == null) {
            if (other.otherChargeLogistic != null) {
                return false;
            }
        } else if (!otherChargeLogistic.equals(other.otherChargeLogistic)) {
            return false;
        }
        if (priceLogistic == null) {
            if (other.priceLogistic != null) {
                return false;
            }
        } else if (!priceLogistic.equals(other.priceLogistic)) {
            return false;
        }
        if (totalChargeLogistic == null) {
            if (other.totalChargeLogistic != null) {
                return false;
            }
        } else if (!totalChargeLogistic.equals(other.totalChargeLogistic)) {
            return false;
        }
        if (weightLogistic == null) {
            if (other.weightLogistic != null) {
                return false;
            }
        } else if (!weightLogistic.equals(other.weightLogistic)) {
            return false;
        }
        return true;
    }
}
