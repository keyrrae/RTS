class Par {
    static int field1;
    int field3;
    int field4;

    Par(int i){
        super();
        field3 = 7;
        field4 = i;
    }

    Par(){
        super();
        field3 = 7;
    }

    static void test1(int i){
        Par p = new Par(i - 1);
        p.field3 += 1;
    }

    void test3(){
        return;
    }

    void test4(int i){
        field4 = i + 1999999;
        field1 += 1;
    }

    static void main(java.lang.String[] args){
        test1(args.length);
        return;
    }
}
