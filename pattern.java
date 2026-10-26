// *
// **
// ***
// ****
// *****

int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
---------------------------------------------------------------------------------
// *****
// ****
// ***
// **
// *

int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
---------------------------------------------------------------------------------

//     *
//    **
//   ***
//  ****
// *****

int n = 5;

for(int i = 1; i <= n; i++) {

    for(int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}
---------------------------------------------------------------------------------

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

int n = 5;
// increasing
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// decreasing
for(int i = 1; i <= n-1; i++) {
    for(int j = 1; j <= n - i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
---------------------------------------------------------------------------------

// 1
// 12
// 123
// 1234
// 12345

int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
---------------------------------------------------------------------------------
//     *
//    ***
//   *****
//  *******
// *********

int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for(int j = 1; j <= (2*i)-1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
---------------------------------------------------------------------------------
// 1
// 22
// 333
// 4444
// 55555

int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(i);
    }
     System.out.println();
}
---------------------------------------------------------------------------------
// 1
// 23
// 456
// 78910
// 1112131415

       int n=5;
        int count=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(count+" ");
         count++;
    }
    System.out.println();
}
---------------------------------------------------------------------------------
// 1
// 01
// 101
// 0101
// 10101

int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) {
        if((i + j) % 2 == 0) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
    System.out.println();
}
---------------------------------------------------------------------------------
//     1
//    121
//   12321
//  1234321
// 123454321

            int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    for(int j = i-1; j >= 1; j--) {
        System.out.print(j);
    }
    System.out.println();
}