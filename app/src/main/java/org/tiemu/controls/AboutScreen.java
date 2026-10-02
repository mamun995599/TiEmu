/*
 *   Graph89 - Emulator for Android
 *  
 *	 Copyright (C) 2012-2013  Dritan Hashorva
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.

 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.tiemu.controls;

import android.app.AlertDialog;
import android.content.Context;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.tiemu.R;
import org.tiemu.emulationcore.EmulatorActivity;

public class AboutScreen
{
	private Context mContext;
	private TextView tv = null;

	public AboutScreen(Context context) {
		mContext = context;
	}

	public void Show() {
		final View view = LayoutInflater.from(mContext).inflate(R.layout.aboutscreen, (ViewGroup) ((EmulatorActivity) mContext).findViewById(R.id.aboutscreen_layout));
		tv = (TextView) view.findViewById(R.id.aboutscreen_text);
		final AlertDialog addEditdialog = new AlertDialog.Builder(mContext).setView(view).setTitle("About").setPositiveButton(android.R.string.ok, null).create();

		// @formatter:off
		String text = "Developer\n" +
				"Abdullah Al Mamun\n\n" +
				"Phone: +8801945120109\n" +
				"Email: mamun995599@gmail.com\n" +
				"Address: Siddhirganj -1428, Narayanganj, Bangladesh.";
		// @formatter:on

		tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
		tv.setText(text);
		Linkify.addLinks(tv, Linkify.WEB_URLS);
		addEditdialog.show();
	}
}
