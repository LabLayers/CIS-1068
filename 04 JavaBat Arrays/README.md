## http://codingbat.com/prob/p175763

````java
public int sum3(int[] nums) {
  int sum = 0;
  for(int num : nums) { sum+=num; }
  return sum;
}
````

## http://codingbat.com/prob/p185685

````java
public boolean firstLast6(int[] nums) {
  if(nums[nums.length-1]==6 || nums[0]==6 ) {
    return true;
  } else {
    return false;
  }
}
````

## http://codingbat.com/prob/p127384

````java
public int sum13(int[] nums) {
  int unlucky = -1, sum = 0;
  for(int i = 0; i < nums.length; i++) {
    if (nums[i] == 13) {
      unlucky = i+1;
    } else if (i == unlucky) {}
    else {
      sum += nums[i];
    }
  }
  return sum;
}
````

## http://codingbat.com/prob/p153059

````java
public String[] fizzBuzz(int start, int end) {
  String[] a = new String[end-start];
  int x = 0;
  for (int i = start; i < end; i++) {
    if (i % 15 == 0) { a[x] = "FizzBuzz"; }
    else if (i % 3 == 0) { a[x] = "Fizz"; }
    else if (i % 5 == 0) { a[x] = "Buzz"; }
    else { a[x] = Integer.toString(i); }
    x++;
  }
  return a;
}
````

## http://codingbat.com/prob/p155405

````java
public int[] squareUp(int n) {
  int[] a = new int[n*n];
  int c = 0;
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
      a[c] = 0;
      c++;
    }
    for (int k = i; k > 0; k--) {
      a[c] = k;
      c++;
    }
  }
  return a;
}
````