package ShopApp2;

import java.util.Date;

public class Bill {
		private int billno;
		private double billtotal;
		private double cgst;
		private double sgst;
		private double finaltotal;
		private Date billdate;
		public Bill(int billno, double billtotal, double cgst, double sgst, double finaltotal, Date billdate) {
//			super();
			this.billno = billno;
			this.billtotal = billtotal;
			this.cgst = cgst;
			this.sgst = sgst;
			this.finaltotal = finaltotal;
			this.billdate = billdate;
		}
		public int getBillno() {
			return billno;
		}
		public void setBillno(int billno) {
			this.billno = billno;
		}
		public double getBilltotal() {
			return billtotal;
		}
		public void setBilltotal(double billtotal) {
			this.billtotal = billtotal;
		}
		public double getCgst() {
			return cgst;
		}
		public void setCgst(double cgst) {
			this.cgst = cgst;
		}
		public double getSgst() {
			return sgst;
		}
		public void setSgst(double sgst) {
			this.sgst = sgst;
		}
		public double getFinaltotal() {
			return finaltotal;
		}
		public void setFinaltotal(double finaltotal) {
			this.finaltotal = finaltotal;
		}
		public Date getBilldate() {
			return billdate;
		}
		public void setBilldate(Date billdate) {
			this.billdate = billdate;
		}
		
		
		
		
		
}
