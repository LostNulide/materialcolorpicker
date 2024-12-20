Color Picker
-------------
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Color%20Picker-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1693)
![https://img.shields.io/github/tag/QuadFlask/colorpicker.svg?label=maven](https://img.shields.io/github/tag/QuadFlask/colorpicker.svg?label=maven)

![icon](https://github.com/QuadFlask/colorpicker/blob/master/app/src/main/res/drawable-xxxhdpi/ic_launcher.png)

Simple android color picker with color wheel and lightness bar.

This fork is updated to use the latest dependencies and MaterialAlertDialog instead of AlertDialog

## Demo video

[Youtube](https://youtu.be/MwWi9X7eqNI)

## Usage
As a dialog
```java
ColorPickerDialogBuilder
	.with(context)
	.setTitle("Choose color")
	.initialColor(currentBackgroundColor)
	.wheelType(ColorPickerView.WHEEL_TYPE.FLOWER)
	.density(12)
	.setOnColorSelectedListener(new OnColorSelectedListener() {
		@Override
		public void onColorSelected(int selectedColor) {
			toast("onColorSelected: 0x" + Integer.toHexString(selectedColor));
		}
	})
	.setPositiveButton("ok", new ColorPickerClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
			changeBackgroundColor(selectedColor);
		}
	})
	.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which) {
		}
	})
	.build()
	.show();
```
As a widget
```xml
	<com.flask.colorpicker.ColorPickerView
		android:id="@+id/color_picker_view"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		app:alphaSlider="true"
		app:density="12"
		app:lightnessSlider="true"
		app:wheelType="FLOWER"
		app:lightnessSliderView="@+id/v_lightness_slider"
	    app:alphaSliderView="@+id/v_alpha_slider"
		/>

	<com.flask.colorpicker.slider.LightnessSlider
		android:id="@+id/v_lightness_slider"
		android:layout_width="match_parent"
		android:layout_height="48dp"
		/>

	<com.flask.colorpicker.slider.AlphaSlider
		android:id="@+id/v_alpha_slider"
		android:layout_width="match_parent"
		android:layout_height="48dp"
		/>
```


## To do

* gradle support
* performance improvement
* refactoring


## License

```
Copyright 2014-2017 QuadFlask

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
