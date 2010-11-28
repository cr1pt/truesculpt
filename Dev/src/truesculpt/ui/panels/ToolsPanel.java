package truesculpt.ui.panels;

import truesculpt.main.Managers;
import truesculpt.main.R;
import truesculpt.main.TrueSculptApp;
import truesculpt.managers.ToolsManager.OnToolChangeListener;
import truesculpt.ui.dialogs.ColorPickerDialog.OnColorChangedListener;
import truesculpt.ui.views.ColorPickerView;
import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class ToolsPanel extends Activity implements OnColorChangedListener, OnToolChangeListener {
	private final int DIALOG_COLOR_PICKER_ID = 0;

	private ColorPickerView mColorPickerView;

	private SeekBar mRadiusSeekBar;

	private TextView mRadiusText;
	private SeekBar mStrengthSeekBar;

	private TextView mStrengthText;

	@Override
	public void colorChanged(int color) {
		getManagers().getToolsManager().setColor(color);
		// String msg = "color is " + Integer.toString(color);
		// Toast.makeText(ToolsPanel.this, msg, Toast.LENGTH_SHORT).show();
	}

	public Managers getManagers() {
		return ((TrueSculptApp) getApplicationContext()).getManagers();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tools);

		getManagers().getToolsManager().registerToolChangeListener(this);

		mRadiusSeekBar = (SeekBar) findViewById(R.id.RadiusBar);
		mRadiusSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				getManagers().getToolsManager().setRadius(progress);
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});
		mRadiusSeekBar.setMax(100);// 0 to 100 pct
		mRadiusText = (TextView) findViewById(R.id.RadiusText);

		mStrengthSeekBar = (SeekBar) findViewById(R.id.StrengthBar);
		mStrengthSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				getManagers().getToolsManager().setStrength(progress - 100);
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});
		mStrengthSeekBar.setMax(200);// -100 to 100 pct
		mStrengthText = (TextView) findViewById(R.id.StrengthText);

		mColorPickerView = (ColorPickerView) findViewById(R.id.ColorPickerView);
		mColorPickerView.SetColorChangeListener(this);
		mColorPickerView.SetColor(getManagers().getToolsManager().getColor());

		UpdateView();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		getManagers().getToolsManager().unRegisterToolChangeListener(this);
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	public void onToolChange() {
		UpdateView();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		finish();
		return super.onTouchEvent(event);
	}

	private void UpdateView() {

		float fStrength = getManagers().getToolsManager().getStrength();
		mStrengthSeekBar.setProgress((int) fStrength + 100);
		mStrengthText.setText("Strength = " + Integer.toString((int) fStrength) + " %");

		float fRadius = getManagers().getToolsManager().getRadius();
		mRadiusSeekBar.setProgress((int) fRadius);
		mRadiusText.setText("Radius = " + Integer.toString((int) fRadius) + " %");
	}

}
