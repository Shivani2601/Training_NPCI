package DSA;
class Ques1
{
    
    public static void sortArray(int[] array)
    {
        int temp = 0;
          for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
  
    }

    public static void main(String[] args) {

        int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
        sortArray(array);

       
    }


    
}