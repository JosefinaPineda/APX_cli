package com.bbva.mzic.dto.projecto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The CustomerDTO class...
 */
public class CustomerDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	private int id;
    private String name;
    private String address;
    private List<Code> code;

	/**
	 * Getters and setters
	 */

	public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

	public int getAddress() {
        return this.address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public List<Code> getCode() {
        return this.code;
    }

    public void setCode(List<Code> code) {
        this.code = code;
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
		final CustomerDTO rhs = (CustomerDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
					.append(name, rhs.name)
					.append(address, rhs.address)
					.append(code, rhs.code)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
			.append(this.address)
			.append(this.code)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.append("address", address)
			.append("code", code)
			.toString();
	}
}
