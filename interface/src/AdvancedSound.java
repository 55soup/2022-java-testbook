
interface Sound{
    public void SoundUp(int level);
    public void SoundDown(int level);
}
interface AdvancedSound extends Sound{ //인터페이스는 인터페이스끼리 extends로 상속을 받는다.
    public void SoundOff();
}


