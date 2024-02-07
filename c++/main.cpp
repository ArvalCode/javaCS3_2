// Your First C++ Program

#include <iostream>

class math{
    private:
    int _x, _y;
    public:
    math(int x, int y){
        _x = x;
        _y = y;
    }
    int add(){
        return _x + _y;
    }
    int subtract(){
        return _x - _y;
    }
};

int main() {
    for (int i = 0; i < 5; i++) {
        for (int k = 0; k < 3; k++) {
            std::cout << i << k << std::endl;
        }
    };

}
