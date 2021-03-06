/*
 * Copyright (C) 2018
 *  Source code is created by Elissa Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package wyp.mcd.infrastructure.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import java.util.List;

import wyp.mcd.component.persistence.DateRoomConverter;
import wyp.mcd.component.util.DbConstants;
import wyp.mcd.infrastructure.entities.EngToMmEntity;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
@TypeConverters(DateRoomConverter.class)
public interface EngToMmDao {

    @Query("SELECT * FROM eng_to_mm WHERE vocabulary LIKE :vocabulary")
    LiveData<List<EngToMmEntity>> find(String vocabulary);

    @Insert(onConflict = REPLACE)
    void insert(EngToMmEntity engToMmEntity);

    @Query("SELECT COUNT(id) FROM eng_to_mm")
    int getCount();

    @Query("SELECT * FROM " + DbConstants.TABLE_NAME_ENG_TO_MM)
    LiveData<List<EngToMmEntity>> getAll();

    @Query("SELECT * FROM eng_to_mm WHERE vocabulary = :vocabulary")
    EngToMmEntity getEngToMm(String vocabulary);
}
