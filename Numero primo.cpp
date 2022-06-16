#include<iostream>

using namespace std;

int main(){
	
	int numero;
	cin>>numero;
	bool primo = true;
	for(int i = 2 ; i <numero ; i++){
		if(numero % i == 0) primo = false;
		
	}
	if (primo == true) cout<<"El numero es primo: ";
	else cout<<"El nunero no es primo";
	
	
	
	
	return 0;
}
