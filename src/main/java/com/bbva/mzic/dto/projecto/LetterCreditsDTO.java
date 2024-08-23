package com.bbva.mzic.dto.projecto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterCreditsDTO class...
 */
public class LetterCreditsDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	private String letter;
    private String reference;
    private int sequence;
    private List<Banks> banks;
    private Customer customer;

	/**
	 * Getters and setters
	 */

	public String getLetter() {
        return this.letter;
    }

    public void setLetter(final String letter) {
        this.letter = letter;
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(final String reference) {
        this.reference = reference;
    }

	public int getSequence() {
        return this.sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

	public List<Banks> getBanks() {
        return this.banks;
    }

    public void setBanks(List<Banks> banks) {
        this.banks = banks;
    }

	public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterCreditsDTO rhs = (LetterCreditsDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(sequence, rhs.sequence)
					.append(banks, rhs.banks)
					.append(customer, rhs.customer)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.sequence)
			.append(this.banks)
			.append(this.customer)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("sequence", sequence)
			.append("banks", banks)
			.append("customer", customer)
			.toString();
	}
}
