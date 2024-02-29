#include<iostream>
 
 using namespace std;

 class pppinheritance{
    private:
    int pvt = 21;;
    protected :
    int pro = 11;
    //function to return private variables
    public:
    int pub = 16;
    int getpvt(){
        return pvt;
    }

 };
 class proinheritance : public pppinheritance{
    public:
    int getpro(){
        return pro;
    }
 };
 int main(){
    proinheritance obj1;
    cout<<obj1.getpvt()<<endl;
    cout<<obj1.getpro()<<endl;
    cout<<obj1.pub<<endl;

 }
