package truesculpt.managers;

import javax.microedition.khronos.opengles.GL10;

import truesculpt.renderer.GeneratedObject;
import android.content.Context;

//for mesh storage, computation and transformation application
public class MeshManager extends BaseManager {

	private GeneratedObject mObject=null;

	public MeshManager(Context baseContext) {
		super(baseContext);
		 
			
	}

	@Override
	public void onCreate() {
		mObject= new GeneratedObject();	
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		
	}
	
	public void draw(GL10 gl)
	{
		if (mObject!=null)
		{
			mObject.draw(gl);
		}
	}

    public int getFacesCount() {
    	int nCount=-1;
    	if (mObject!=null)
		{
		 	nCount=mObject.getFacesCount();
		}
    	return nCount;
	}
    
    public int getVertexCount() {
    	int nCount=-1;
    	if (mObject!=null)
		{
		 	nCount=mObject.getVertexCount();
		}
    	return nCount;
	}

    
}
