package cn.sunjiachao.s7common.model.web;

import java.io.Serializable;
import java.util.List;

/**
 * 分页类
 *
 * @author jiachao.sun
 */
public class Page<M extends Serializable> implements Serializable {

    private static final long serialVersionUID = -1520685091660746200L;

    private List<M> list;
    private long numsPerPage; // 每页数
    private long totalRows; // 总行数
    private long totalPages; // 总页数
    private long currentPage; // 当前页码
    private long startIndex; // 开始索引
    private long endIndex; // 结束索引

    public Page(List<M> list, long totalRows, long currentPage, long numsPerPage) {
        this.list = list;
        this.numsPerPage = numsPerPage;
        this.totalRows = totalRows;
        this.currentPage = currentPage;
        this.totalPages = (totalRows + numsPerPage - 1) / numsPerPage;
    }

    public List<M> getList() {
        return list;
    }

    public void setList(List<M> list) {
        this.list = list;
    }

    public long getNumsPerPage() {
        return numsPerPage;
    }

    public void setNumsPerPage(long numsPerPage) {
        this.numsPerPage = numsPerPage;
    }

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(long startIndex) {
        this.startIndex = startIndex;
    }

    public long getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(long endIndex) {
        this.endIndex = endIndex;
    }

}
