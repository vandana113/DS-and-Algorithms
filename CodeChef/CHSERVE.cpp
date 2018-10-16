#include <iostream>
using namespace std;


string nextTurn(int n1,int n2,int k){
    int s=n1+n2;
    return (s/k)%2==0?"CHEF":"COOK";
}

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t!=0){
	    int n1,n2,k;
	    cin>>n1>>n2>>k;
	    string result=nextTurn(n1,n2,k);
	    cout<<result<<"\n";
	    t--;
	}
	
	return 0;
}

