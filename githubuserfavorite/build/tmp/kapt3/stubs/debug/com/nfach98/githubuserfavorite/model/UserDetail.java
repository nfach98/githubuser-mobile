package com.nfach98.githubuserfavorite.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b}\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00f7\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010%J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010z\u001a\u00020\u000bH\u00c6\u0003J\t\u0010{\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010~\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000bH\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00fc\u0002\u0010\u008c\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\n\u0010\u008d\u0001\u001a\u00020\u000bH\u00d6\u0001J\u0016\u0010\u008e\u0001\u001a\u00020\u00122\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u00d6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u000bH\u00d6\u0001J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00d6\u0001J\u001e\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u000bH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\'\"\u0004\b+\u0010)R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\'\"\u0004\b-\u0010)R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\'\"\u0004\b/\u0010)R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\'\"\u0004\b1\u0010)R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\'\"\u0004\b3\u0010)R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\'\"\u0004\b5\u0010)R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\'\"\u0004\b;\u0010)R\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00107\"\u0004\b=\u00109R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\'\"\u0004\b?\u0010)R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\'\"\u0004\bA\u0010)R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\'\"\u0004\bC\u0010)R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\'\"\u0004\bI\u0010)R\u001e\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00107\"\u0004\bK\u00109R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\'\"\u0004\bM\u0010)R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\'\"\u0004\bO\u0010)R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\'\"\u0004\bQ\u0010)R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\'\"\u0004\bS\u0010)R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\'\"\u0004\bU\u0010)R\u001e\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u00107\"\u0004\bW\u00109R\u001e\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u00107\"\u0004\bY\u00109R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\'\"\u0004\b[\u0010)R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\'\"\u0004\b]\u0010)R\u001e\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\'\"\u0004\ba\u0010)R \u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\'\"\u0004\bc\u0010)R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\'\"\u0004\be\u0010)R \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\'\"\u0004\bg\u0010)R \u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\'\"\u0004\bi\u0010)R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\'\"\u0004\bk\u0010)\u00a8\u0006\u0098\u0001"}, d2 = {"Lcom/nfach98/githubuserfavorite/model/UserDetail;", "Landroid/os/Parcelable;", "avatarUrl", "", "bio", "blog", "company", "createdAt", "email", "eventsUrl", "followers", "", "followersUrl", "following", "followingUrl", "gistsUrl", "gravatarId", "hireable", "", "htmlUrl", "id", "location", "login", "name", "nodeId", "organizationsUrl", "publicGists", "publicRepos", "receivedEventsUrl", "reposUrl", "siteAdmin", "starredUrl", "subscriptionsUrl", "twitterUsername", "type", "updatedAt", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "getBio", "setBio", "getBlog", "setBlog", "getCompany", "setCompany", "getCreatedAt", "setCreatedAt", "getEmail", "setEmail", "getEventsUrl", "setEventsUrl", "getFollowers", "()I", "setFollowers", "(I)V", "getFollowersUrl", "setFollowersUrl", "getFollowing", "setFollowing", "getFollowingUrl", "setFollowingUrl", "getGistsUrl", "setGistsUrl", "getGravatarId", "setGravatarId", "getHireable", "()Z", "setHireable", "(Z)V", "getHtmlUrl", "setHtmlUrl", "getId", "setId", "getLocation", "setLocation", "getLogin", "setLogin", "getName", "setName", "getNodeId", "setNodeId", "getOrganizationsUrl", "setOrganizationsUrl", "getPublicGists", "setPublicGists", "getPublicRepos", "setPublicRepos", "getReceivedEventsUrl", "setReceivedEventsUrl", "getReposUrl", "setReposUrl", "getSiteAdmin", "setSiteAdmin", "getStarredUrl", "setStarredUrl", "getSubscriptionsUrl", "setSubscriptionsUrl", "getTwitterUsername", "setTwitterUsername", "getType", "setType", "getUpdatedAt", "setUpdatedAt", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "githubuserfavorite_debug"})
public final class UserDetail implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "avatar_url")
    @com.google.gson.annotations.SerializedName(value = "avatar_url")
    private java.lang.String avatarUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "bio")
    @com.google.gson.annotations.SerializedName(value = "bio")
    private java.lang.String bio;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "blog")
    @com.google.gson.annotations.SerializedName(value = "blog")
    private java.lang.String blog;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "company")
    @com.google.gson.annotations.SerializedName(value = "company")
    private java.lang.String company;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "created_at")
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private java.lang.String createdAt;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "email")
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "events_url")
    @com.google.gson.annotations.SerializedName(value = "events_url")
    private java.lang.String eventsUrl;
    @androidx.room.ColumnInfo(name = "followers")
    @com.google.gson.annotations.SerializedName(value = "followers")
    private int followers;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "followers_url")
    @com.google.gson.annotations.SerializedName(value = "followers_url")
    private java.lang.String followersUrl;
    @androidx.room.ColumnInfo(name = "following")
    @com.google.gson.annotations.SerializedName(value = "following")
    private int following;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "following_url")
    @com.google.gson.annotations.SerializedName(value = "following_url")
    private java.lang.String followingUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "gists_url")
    @com.google.gson.annotations.SerializedName(value = "gists_url")
    private java.lang.String gistsUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "gravatar_id")
    @com.google.gson.annotations.SerializedName(value = "gravatar_id")
    private java.lang.String gravatarId;
    @androidx.room.ColumnInfo(name = "hireable")
    @com.google.gson.annotations.SerializedName(value = "hireable")
    private boolean hireable;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "html_url")
    @com.google.gson.annotations.SerializedName(value = "html_url")
    private java.lang.String htmlUrl;
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "location")
    @com.google.gson.annotations.SerializedName(value = "location")
    private java.lang.String location;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "login")
    @com.google.gson.annotations.SerializedName(value = "login")
    private java.lang.String login;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "name")
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "node_id")
    @com.google.gson.annotations.SerializedName(value = "node_id")
    private java.lang.String nodeId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "organizations_url")
    @com.google.gson.annotations.SerializedName(value = "organizations_url")
    private java.lang.String organizationsUrl;
    @androidx.room.ColumnInfo(name = "public_gists")
    @com.google.gson.annotations.SerializedName(value = "public_gists")
    private int publicGists;
    @androidx.room.ColumnInfo(name = "public_repos")
    @com.google.gson.annotations.SerializedName(value = "public_repos")
    private int publicRepos;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "received_events_url")
    @com.google.gson.annotations.SerializedName(value = "received_events_url")
    private java.lang.String receivedEventsUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "repos_url")
    @com.google.gson.annotations.SerializedName(value = "repos_url")
    private java.lang.String reposUrl;
    @androidx.room.ColumnInfo(name = "site_admin")
    @com.google.gson.annotations.SerializedName(value = "site_admin")
    private boolean siteAdmin;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "starred_url")
    @com.google.gson.annotations.SerializedName(value = "starred_url")
    private java.lang.String starredUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "subscriptions_url")
    @com.google.gson.annotations.SerializedName(value = "subscriptions_url")
    private java.lang.String subscriptionsUrl;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "twitter_username")
    @com.google.gson.annotations.SerializedName(value = "twitter_username")
    private java.lang.String twitterUsername;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "type")
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "updated_at")
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private java.lang.String updatedAt;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "url")
    @com.google.gson.annotations.SerializedName(value = "url")
    private java.lang.String url;
    public static final android.os.Parcelable.Creator<com.nfach98.githubuserfavorite.model.UserDetail> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    public final void setAvatarUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBio() {
        return null;
    }
    
    public final void setBio(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlog() {
        return null;
    }
    
    public final void setBlog(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompany() {
        return null;
    }
    
    public final void setCompany(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEventsUrl() {
        return null;
    }
    
    public final void setEventsUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getFollowers() {
        return 0;
    }
    
    public final void setFollowers(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFollowersUrl() {
        return null;
    }
    
    public final void setFollowersUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getFollowing() {
        return 0;
    }
    
    public final void setFollowing(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFollowingUrl() {
        return null;
    }
    
    public final void setFollowingUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGistsUrl() {
        return null;
    }
    
    public final void setGistsUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGravatarId() {
        return null;
    }
    
    public final void setGravatarId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getHireable() {
        return false;
    }
    
    public final void setHireable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHtmlUrl() {
        return null;
    }
    
    public final void setHtmlUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogin() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNodeId() {
        return null;
    }
    
    public final void setNodeId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrganizationsUrl() {
        return null;
    }
    
    public final void setOrganizationsUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getPublicGists() {
        return 0;
    }
    
    public final void setPublicGists(int p0) {
    }
    
    public final int getPublicRepos() {
        return 0;
    }
    
    public final void setPublicRepos(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceivedEventsUrl() {
        return null;
    }
    
    public final void setReceivedEventsUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReposUrl() {
        return null;
    }
    
    public final void setReposUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getSiteAdmin() {
        return false;
    }
    
    public final void setSiteAdmin(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStarredUrl() {
        return null;
    }
    
    public final void setStarredUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscriptionsUrl() {
        return null;
    }
    
    public final void setSubscriptionsUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTwitterUsername() {
        return null;
    }
    
    public final void setTwitterUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public UserDetail(@org.jetbrains.annotations.Nullable()
    java.lang.String avatarUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    java.lang.String blog, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String eventsUrl, int followers, @org.jetbrains.annotations.Nullable()
    java.lang.String followersUrl, int following, @org.jetbrains.annotations.Nullable()
    java.lang.String followingUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String gistsUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String gravatarId, boolean hireable, @org.jetbrains.annotations.Nullable()
    java.lang.String htmlUrl, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    java.lang.String login, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String nodeId, @org.jetbrains.annotations.Nullable()
    java.lang.String organizationsUrl, int publicGists, int publicRepos, @org.jetbrains.annotations.Nullable()
    java.lang.String receivedEventsUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String reposUrl, boolean siteAdmin, @org.jetbrains.annotations.Nullable()
    java.lang.String starredUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriptionsUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String twitterUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        super();
    }
    
    public UserDetail() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    public final boolean component26() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nfach98.githubuserfavorite.model.UserDetail copy(@org.jetbrains.annotations.Nullable()
    java.lang.String avatarUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    java.lang.String blog, @org.jetbrains.annotations.Nullable()
    java.lang.String company, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String eventsUrl, int followers, @org.jetbrains.annotations.Nullable()
    java.lang.String followersUrl, int following, @org.jetbrains.annotations.Nullable()
    java.lang.String followingUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String gistsUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String gravatarId, boolean hireable, @org.jetbrains.annotations.Nullable()
    java.lang.String htmlUrl, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    java.lang.String login, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String nodeId, @org.jetbrains.annotations.Nullable()
    java.lang.String organizationsUrl, int publicGists, int publicRepos, @org.jetbrains.annotations.Nullable()
    java.lang.String receivedEventsUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String reposUrl, boolean siteAdmin, @org.jetbrains.annotations.Nullable()
    java.lang.String starredUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriptionsUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String twitterUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.nfach98.githubuserfavorite.model.UserDetail> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.nfach98.githubuserfavorite.model.UserDetail[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.nfach98.githubuserfavorite.model.UserDetail createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}