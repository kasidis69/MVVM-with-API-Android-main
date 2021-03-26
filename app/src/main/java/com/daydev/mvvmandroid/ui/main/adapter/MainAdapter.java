package com.daydev.mvvmandroid.ui.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.Glide;
import com.daydev.mvvmandroid.data.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        xi = 2,
        d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"},
        d2 = {"Lcom/daydev/mvvmandroid/ui/main/adapter/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/daydev/mvvmandroid/ui/main/adapter/MainAdapter$DataViewHolder;", "users", "Ljava/util/ArrayList;", "Lcom/daydev/mvvmandroid/data/model/User;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "addData", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DataViewHolder", "MVVM_Android.app"}
)
public final class MainAdapter extends Adapter {
    private final ArrayList users;

    @NotNull
    public MainAdapter.DataViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View var10002 = LayoutInflater.from(parent.getContext()).inflate(1300080, parent, false);
        Intrinsics.checkNotNullExpressionValue(var10002, "LayoutInflater.from(pare…item_layout,parent,false)");
        return new MainAdapter.DataViewHolder(var10002);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull MainAdapter.DataViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10001 = this.users.get(position);
        Intrinsics.checkNotNullExpressionValue(var10001, "users[position]");
        holder.bind((User)var10001);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(ViewHolder var1, int var2) {
        this.onBindViewHolder((MainAdapter.DataViewHolder)var1, var2);
    }

    public int getItemCount() {
        return this.users.size();
    }

    public final void addData(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.users.addAll((Collection)list);
    }

    public MainAdapter(@NotNull ArrayList users) {
        Intrinsics.checkNotNullParameter(users, "users");
        super();
        this.users = users;
    }

    @Metadata(
            mv = {1, 1, 16},
            bv = {1, 0, 3},
            k = 1,
            xi = 2,
            d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"},
            d2 = {"Lcom/daydev/mvvmandroid/ui/main/adapter/MainAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "user", "Lcom/daydev/mvvmandroid/data/model/User;", "MVVM_Android.app"}
    )
    public static final class DataViewHolder extends ViewHolder {
        public final void bind(@NotNull User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            View var10000 = this.itemView.findViewById(1000261);
            Intrinsics.checkNotNullExpressionValue(var10000, "itemView.findViewById<Te…w>(R.id.textViewUserName)");
            ((TextView)var10000).setText((CharSequence)user.getName());
            var10000 = this.itemView.findViewById(1000065);
            Intrinsics.checkNotNullExpressionValue(var10000, "itemView.findViewById<Te…>(R.id.textViewUserEmail)");
            ((TextView)var10000).setText((CharSequence)user.getDescription());
            var10000 = this.itemView.findViewById(1000303);
            Intrinsics.checkNotNullExpressionValue(var10000, "itemView.findViewById<Im…ew>(R.id.imageViewAvatar)");
            Glide.with(((ImageView)var10000).getContext()).load(user.getIconUrl()).into((ImageView)this.itemView.findViewById(1000303));
        }

        public DataViewHolder(@NotNull View itemView) {
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            super(itemView);
        }
    }
}
