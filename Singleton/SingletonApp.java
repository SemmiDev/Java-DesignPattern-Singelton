package SingletonApp;

public class SingletonApp{
	public static void main(String[] args) {
		OrderService orderService new OrderService();
		orderService.save("0001");	

		OrderDetailService orderDetailService = new OrderDetailService();
		orderService.save("0001","Indomie")
		orderService.save("0001","Sabun");
		orderService.save("0001","Pepsodent");;
	}
}