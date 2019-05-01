package designpatterns.creational.prototype.dtopassing;

public class CardDTO {

	private String holderName;
	private String expireMonth;
	private String expireYear;
	private String binNumber;
	private String encryptedCardNumber;
	private String encryptedCVC;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public String getBinNumber() {
		return binNumber;
	}

	public void setBinNumber(String binNumber) {
		this.binNumber = binNumber;
	}

	public String getEncryptedCardNumber() {
		return encryptedCardNumber;
	}

	public void setEncryptedCardNumber(String encryptedCardNumber) {
		this.encryptedCardNumber = encryptedCardNumber;
	}

	public String getEncryptedCVC() {
		return encryptedCVC;
	}

	public void setEncryptedCVC(String encryptedCVC) {
		this.encryptedCVC = encryptedCVC;
	}

}
