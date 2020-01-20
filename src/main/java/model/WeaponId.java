package model;
// Generated 20-ene-2020 16:13:16 by Hibernate Tools 5.4.7.Final

/**
 * WeaponId generated by hbm2java
 */
public class WeaponId implements java.io.Serializable {

	private int weaponId;
	private String name;
	private String type;
	private int damage;
	private int accuracy;

	public WeaponId() {
	}

	public WeaponId(int weaponId, String name, String type, int damage, int accuracy) {
		this.weaponId = weaponId;
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.accuracy = accuracy;
	}

	public int getWeaponId() {
		return this.weaponId;
	}

	public void setWeaponId(int weaponId) {
		this.weaponId = weaponId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAccuracy() {
		return this.accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WeaponId))
			return false;
		WeaponId castOther = (WeaponId) other;

		return (this.getWeaponId() == castOther.getWeaponId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
						&& this.getType().equals(castOther.getType())))
				&& (this.getDamage() == castOther.getDamage()) && (this.getAccuracy() == castOther.getAccuracy());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getWeaponId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result + this.getDamage();
		result = 37 * result + this.getAccuracy();
		return result;
	}

}
