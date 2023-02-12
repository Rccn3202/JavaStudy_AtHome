package Other.Ex01;



public class Sales {
	   
	   private String saleDate; //매출일자
	   private String code; //거래처코드
	   private String location; //매출지역
	   private int saleAmount; // 판매량
	   private int saleMoney; //매출금액
	   private String phone; //연락처
	   
	   // 생성자
	   public Sales(String saleDate, String code, String location, int saleAmount, int saleMoney, String phone) {
	      this.saleDate = saleDate;
	      this.code = code;
	      this.location = location;
	      this.saleAmount = saleAmount;
	      this.saleMoney = saleMoney;
	      this.phone = phone;
	   }

	   // 게터세터
	   public String getSaleDate() {
	      return saleDate;
	   }

	   public void setSaleDate(String saleDate) {
	      this.saleDate = saleDate;
	   }

	   public String getCode() {
	      return code;
	   }

	   public void setCode(String code) {
	      this.code = code;
	   }

	   public String getLocation() {
	      return location;
	   }

	   public void setLocation(String location) {
	      this.location = location;
	   }

	   public int getSaleAmount() {
	      return saleAmount;
	   }

	   public void setSaleAmount(int saleAmount) {
	      this.saleAmount = saleAmount;
	   }

	   public int getSaleMoney() {
	      return saleMoney;
	   }

	   public void setSaleMoney(int saleMoney) {
	      this.saleMoney = saleMoney;
	   }

	   public String getPhone() {
	      return phone;
	   }

	   public void setPhone(String phone) {
	      this.phone = phone;
	   }
	   
	   

	}