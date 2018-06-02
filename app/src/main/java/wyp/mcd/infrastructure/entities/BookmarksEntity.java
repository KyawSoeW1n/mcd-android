/*
 * Copyright (C) 2018
 *
 * Source code is created by Elissa Software
 * Dictionary data is owned by UCST
 * Database is implemented by Salai Chit Oo Latt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package wyp.mcd.infrastructure.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import wyp.mcd.component.persistence.RoomEntity;
import wyp.mcd.component.util.Constants;

@Entity(tableName = Constants.TABLE_NAME_BOOKMARKS)
@Data
@EqualsAndHashCode(callSuper = false)
public class BookmarksEntity extends RoomEntity {

    @ColumnInfo(name = "bookmark_word", index = true)
    private String bookmarkWord;

//    @Ignore
//    Calendar calendar = Calendar.getInstance();
//    @Ignore
//    Date currentDate = calendar.getTime();

    public BookmarksEntity(String bookmarkWord) {
        this.bookmarkWord = bookmarkWord;
        //this.createdDate = currentDate;
        //this.updatedDate = currentDate;
    }
}
