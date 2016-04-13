/**
 * Copyright (c) 2015-2016, Michael Yang 杨福海 (fuhai999@gmail.com).
 *
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.model.base;

import io.jpress.core.JModel;
import io.jpress.model.Metadata;

import java.util.List;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.ehcache.CacheKit;

/**
 *  Auto generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseContent<M extends BaseContent<M>> extends JModel<M> implements IBean {

	public static final String CACHE_NAME = "content";
	public static final String METADATA_TYPE = "content";

	public void removeCache(String key){
		CacheKit.remove(CACHE_NAME, key);
	}

	public void putCache(Object key,Object value){
		CacheKit.put(CACHE_NAME, key, value);
	}

	public M getCache(Object key){
		return CacheKit.get(CACHE_NAME, key);
	}

	public Metadata findMetadata(String key){
		return Metadata.findByTypeAndIdAndKey(METADATA_TYPE, getId(), key);
	}

	public List<Metadata> findMetadataList(){
		return Metadata.findListByTypeAndId(METADATA_TYPE, getId());
	}

	public M findFirstFromMetadata(String key,Object value){
		Metadata md = Metadata.findFirstByTypeAndValue(METADATA_TYPE, key, value);
		if(md != null){
			long id = md.getObjectId();
			return findById(id);
		}
		return null;
	}

	public Metadata createMetadata(){
		Metadata md = new Metadata();
		md.setObjectId(getId());
		md.setObjectType(METADATA_TYPE);
		return md;
	}

	public Metadata createMetadata(String key,String value){
		Metadata md = new Metadata();
		md.setObjectId(getId());
		md.setObjectType(METADATA_TYPE);
		md.setMetaKey(key);
		md.setMetaValue(value);
		return md;
	}

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}

	public java.lang.String getText() {
		return get("text");
	}

	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}

	public java.lang.String getThumbnail() {
		return get("thumbnail");
	}

	public void setModule(java.lang.String module) {
		set("module", module);
	}

	public java.lang.String getModule() {
		return get("module");
	}

	public void setStyle(java.lang.String style) {
		set("style", style);
	}

	public java.lang.String getStyle() {
		return get("style");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

	public java.lang.Long getUserId() {
		return get("user_id");
	}

	public void setParentId(java.lang.Long parentId) {
		set("parent_id", parentId);
	}

	public java.lang.Long getParentId() {
		return get("parent_id");
	}

	public void setObjectId(java.lang.Long objectId) {
		set("object_id", objectId);
	}

	public java.lang.Long getObjectId() {
		return get("object_id");
	}

	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}

	public java.lang.Integer getOrderNumber() {
		return get("order_number");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return get("status");
	}

	public void setVoteUp(java.lang.Long voteUp) {
		set("vote_up", voteUp);
	}

	public java.lang.Long getVoteUp() {
		return get("vote_up");
	}

	public void setVoteDown(java.lang.Long voteDown) {
		set("vote_down", voteDown);
	}

	public java.lang.Long getVoteDown() {
		return get("vote_down");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setCommentStatus(java.lang.String commentStatus) {
		set("comment_status", commentStatus);
	}

	public java.lang.String getCommentStatus() {
		return get("comment_status");
	}

	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}

	public java.lang.Long getCommentCount() {
		return get("comment_count");
	}

	public void setViewCount(java.lang.Long viewCount) {
		set("view_count", viewCount);
	}

	public java.lang.Long getViewCount() {
		return get("view_count");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setCreatedGmt(java.util.Date createdGmt) {
		set("created_gmt", createdGmt);
	}

	public java.util.Date getCreatedGmt() {
		return get("created_gmt");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return get("modified");
	}

	public void setModifiedGmt(java.util.Date modifiedGmt) {
		set("modified_gmt", modifiedGmt);
	}

	public java.util.Date getModifiedGmt() {
		return get("modified_gmt");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}

	public java.lang.String getSlug() {
		return get("slug");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}

	public java.lang.String getFlag() {
		return get("flag");
	}

	public void setLat(java.math.BigDecimal lat) {
		set("lat", lat);
	}

	public java.math.BigDecimal getLat() {
		return get("lat");
	}

	public void setLng(java.math.BigDecimal lng) {
		set("lng", lng);
	}

	public java.math.BigDecimal getLng() {
		return get("lng");
	}

	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}

	public java.lang.String getMetaKeywords() {
		return get("meta_keywords");
	}

	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}

	public java.lang.String getMetaDescription() {
		return get("meta_description");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}

	public java.lang.String getRemarks() {
		return get("remarks");
	}

}
