public class JDZ1{
    public static void main(String[] args){
        int[] newArray = {4,2,3,4,5,1,3,4,42,124};
        int _Max = newArray[0];
        int _Min = newArray[0];
        for(int i = 0; i<newArray.length;i++){
            if(newArray[i]>_Max){
                _Max = newArray[i];
            }
            if(newArray[i]<_Min){
                _Min = newArray[i];
            }
        }
        System.out.println(String.format("Минимальный элемент массива: %d\nМаксимальный элемент массива: %d",_Min, _Max));
    }
}


