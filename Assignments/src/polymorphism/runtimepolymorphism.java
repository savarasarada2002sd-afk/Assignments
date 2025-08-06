package polymorphism;

public class runtimepolymorphism {

	public static void main(String[] args) {
		class product {
			string name;
			double price;
			product(string name,double price){
				this.name = name;
				this.price = price;
			}
			void apply discount() {
				system.out.println("no discount for generic product.");
			}
			void display() {
				System.out.println(name+"-final price:$+price");
			}
		}
		class electronics extends product{
			electronics(string name,double price){
				super(name,price);
			}
			void aaplydiscount()
			{
				price = price - (price*0.10);
			}
			
				
			}
		}
		// TODO Auto-generated method stub

	}

}
