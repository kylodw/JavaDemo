package test9;

public class TvController implements PowerController {
    TvState mTvState;

    public void setmTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setmTvState(new PowerOnState());
        System.out.println("开机了");
    }

    @Override
    public void powerOff() {
        setmTvState(new PowerOffState());
        System.out.println("关机了");
    }

    @Override
    public void nextChannel() {
        mTvState.nextChannel();
    }

    @Override
    public void prevChannel() {
        mTvState.prevChannel();
    }

    @Override
    public void turnUp() {
        mTvState.turnUp();
    }

    @Override
    public void turnDown() {
        mTvState.turnDown();
    }
}
