package truesculpt.main;

import truesculpt.managers.ActionsManager;
import truesculpt.managers.FileManager;
import truesculpt.managers.MemoryManager;
import truesculpt.managers.MeshManager;
import truesculpt.managers.OptionsManager;
import truesculpt.managers.PointOfViewManager;
import truesculpt.managers.RendererManager;
import truesculpt.managers.SensorsManager;
import truesculpt.managers.ToolsManager;
import truesculpt.managers.TouchManager;
import truesculpt.managers.UpdateManager;
import truesculpt.managers.UsageStatisticsManager;
import truesculpt.managers.WebManager;
import android.content.Context;

public class Managers {

	public Managers() {

	}

	/**
	 * @return the mActionsManager
	 */
	public ActionsManager getmActionsManager() {
		return mActionsManager;
	}

	/**
	 * @return the mMemoryManager
	 */
	public MemoryManager getmMemoryManager() {
		return mMemoryManager;
	}

	/**
	 * @return the mMeshManager
	 */
	public MeshManager getmMeshManager() {
		return mMeshManager;
	}

	/**
	 * @return the mOptionsManager
	 */
	public OptionsManager getmOptionsManager() {
		return mOptionsManager;
	}

	/**
	 * @return the mPointOfViewManager
	 */
	public PointOfViewManager getmPointOfViewManager() {
		return mPointOfViewManager;
	}

	/**
	 * @return the mRendererManager
	 */
	public RendererManager getmRendererManager() {
		return mRendererManager;
	}

	/**
	 * @return the mSensorsManager
	 */
	public SensorsManager getmSensorsManager() {
		return mSensorsManager;
	}

	/**
	 * @return the mToolsManager
	 */
	public ToolsManager getmToolsManager() {
		return mToolsManager;
	}

	/**
	 * @return the mTouchManager
	 */
	public TouchManager getmTouchManager() {
		return mTouchManager;
	}

	/**
	 * @return the mUpdateManager
	 */
	public UpdateManager getmUpdateManager() {
		return mUpdateManager;
	}

	/**
	 * @return the mWebManager
	 */
	public WebManager getmWebManager() {
		return mWebManager;
	}

	/**
	 * @return the mUsageStatisticsManager
	 */
	public UsageStatisticsManager getmUsageStatisticsManager() {
		return mUsageStatisticsManager;
	}
	
	/**
	 * @return the mFileManager
	 */
	public FileManager getmFileManager() {
		return mFileManager;
	}

	
	private ActionsManager mActionsManager = null;
	private MemoryManager mMemoryManager = null;
	private MeshManager mMeshManager = null;
	private OptionsManager mOptionsManager = null;
	private PointOfViewManager mPointOfViewManager = null;
	private RendererManager mRendererManager = null;
	private SensorsManager mSensorsManager = null;
	private ToolsManager mToolsManager = null;
	private TouchManager mTouchManager = null;
	private UpdateManager mUpdateManager = null;
	private WebManager mWebManager = null;
	private UsageStatisticsManager mUsageStatisticsManager = null;
	private FileManager mFileManager = null;
	

	public void Init(Context baseContext) {
		mActionsManager = new ActionsManager(baseContext);
		mMemoryManager = new MemoryManager(baseContext);
		mMeshManager = new MeshManager(baseContext);
		mOptionsManager = new OptionsManager(baseContext);
		mPointOfViewManager = new PointOfViewManager(baseContext);
		mRendererManager = new RendererManager(baseContext);
		mSensorsManager = new SensorsManager(baseContext);
		mToolsManager = new ToolsManager(baseContext);
		mTouchManager = new TouchManager(baseContext);
		mUpdateManager = new UpdateManager(baseContext);
		mWebManager = new WebManager(baseContext);
		mUsageStatisticsManager= new UsageStatisticsManager(baseContext);
		mFileManager= new FileManager(baseContext);
	}

}