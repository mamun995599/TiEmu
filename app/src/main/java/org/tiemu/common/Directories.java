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


package org.tiemu.common;

import org.tiemu.emulationcore.TiEmuActivityBase;

public class Directories
{
	public static String getTempDirectory(TiEmuActivityBase activity)
	{
		String folder = Util.GetInternalAppStorage(activity) + "tmp/";
		if (folder != null)
		{
			Util.CreateDirectory(folder);
		}
		return folder;
	}

	public static String getInstanceDirectory(TiEmuActivityBase activity) {
		String folder = Util.GetInternalAppStorage(activity) + "instances/";
		if (folder != null)
		{
			Util.CreateDirectory(folder);
		}
		return folder;
	}

	public static String getScreenShotDirectory(TiEmuActivityBase activity)
	{
		return Util.GetMediaRootFolder(activity) + "tiemu/screenshots/";
	}

	public static String getLicenceFile(TiEmuActivityBase activity)
	{
		return Util.GetMediaRootFolder(activity) + "tiemu/licence.lic";
	}

	public static String getReceivedDirectory(TiEmuActivityBase activity)
	{
		return Util.GetMediaRootFolder(activity) + "tiemu/received/";
	}

	public static String getBackupDirectory(TiEmuActivityBase activity)
	{
		return Util.GetMediaRootFolder(activity) + "tiemu/backup/";
	}

	public static String getRestoreDirectory(TiEmuActivityBase activity)
	{
		String folder = Util.GetInternalAppStorage(activity) + "restore/";
		if (folder != null)
		{
			Util.CreateDirectory(folder);
		}
		return folder;
	}
}
